package com.spon.utils.compress;

import com.spon.utils.CloseUtil;

import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * 解压和压缩的util，可以用来存储一些可以放到数据库中的二进制数据
 * 比如将视频转换成二进制数据，存储到数据库中的blob类型中
 * Created by myg on 2016/9/21.
 */
public final class CompressUtils {


    public static byte[] serializeAndCompress(Object obj) {
        if (obj == null) {
            return null;
        }

        ObjectOutputStream os = null;
        ByteArrayOutputStream bs = null;
        try {
            bs = new ByteArrayOutputStream();
            os = new ObjectOutputStream(new GZIPOutputStream(bs));
            os.writeObject(obj);
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("IO exception serializingAndCompress data");
        } finally {
            try {
                os.close();
            } catch (Exception e) {
            }
        }
        byte[] rv = bs.toByteArray();
        return rv;
    }

    public static Object decompressAndDeSerialize(byte[] data) {
        if (data == null) {
            return null;
        }
        ObjectInputStream os = null;
        try {
            ByteArrayInputStream bs = new ByteArrayInputStream(data);
            os = new ObjectInputStream(new GZIPInputStream(bs));
            Object obj = os.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("IO exception decompressAndDeSerialize data");
        } finally {
            try {
                os.close();
            } catch (Exception e) {
            }
        }
    }

    public static byte[] compress(byte[] in) {
        if (in == null) {
            throw new NullPointerException("Can't compress null");
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        GZIPOutputStream gz = null;
        try {
            gz = new GZIPOutputStream(bos);
            gz.write(in);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("IO exception compressing data", e);
        } finally {
			CloseUtil.close(gz);
			CloseUtil.close(bos);
        }
        byte[] rv = bos.toByteArray();
        return rv;
    }

    public static byte[] decompress(byte[] in) {
        ByteArrayOutputStream bos = null;
        if (in != null) {
            ByteArrayInputStream bis = new ByteArrayInputStream(in);
            bos = new ByteArrayOutputStream();
            GZIPInputStream gis;
            try {
                gis = new GZIPInputStream(bis);

                byte[] buf = new byte[8192];
                int r = -1;
                while ((r = gis.read(buf)) > 0) {
                    bos.write(buf, 0, r);
                }
            } catch (IOException e) {
                bos = null;
            }
        }
        return bos == null ? null : bos.toByteArray();
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("e:/sftp/7x190openid.sql"));
            String line = reader.readLine();
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            System.out.println("长度：" + sb.length());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long time = System.currentTimeMillis();
        // byte [] out = CompressUtils.serializeAndCompress(sb.toString());
        // System.out.println("len"+out.length);
        byte[] in = sb.toString().getBytes();
        CompressUtils.compressTest(in, 0, in.length);
        System.out.println("time=" + (System.currentTimeMillis() - time));
        System.out.println("===");

    }

    public static void compressTest(byte[] inputs, int offset, int byteLen) {

        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        Deflater deflater = null;
        int total = 0;
        try {
            deflater = new Deflater();
            int cachesize = 1024;
            byte[] buf = new byte[cachesize];

            for (int i = 0; i < byteLen; i += cachesize) {
                deflater.setInput(inputs, offset + i, Math.min(cachesize, byteLen - i));
                while (!deflater.needsInput()) {
                    int len = deflater.deflate(buf, 0, cachesize);
                    total = total + len;
                    if (len > 0) {
                        bs.write(buf, 0, len);
                    }
                }
            }
            if (!deflater.finished()) {
                deflater.finish();
                while (!deflater.finished()) {
                    int len = deflater.deflate(buf, 0, cachesize);
                    total = total + len;
                    if (len > 0) {
                        bs.write(buf, 0, len);
                    }
                }
            }

            System.out.println("total=" + total);

            InflaterInputStream inf = new InflaterInputStream(new ByteArrayInputStream(bs.toByteArray()));
            int num = inf.read(buf, 0, cachesize);
            while (num != -1) {
                num = inf.read(buf, 0, cachesize);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deflater.end();
        }

    }
}
