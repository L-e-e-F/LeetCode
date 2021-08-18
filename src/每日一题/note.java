package 每日一题;

import java.io.*;

public class note {

    public static void main ( String[] args ) {
        String fileadd = "C:\\Users\\Berthcon Trofael\\Desktop\\from.txt";
        File filename = new File ( fileadd );
        File fileadd_2 = new File ( "C:\\Users\\Berthcon Trofael\\Desktop\\test.txt" );
        try {
            //创建流
            InputStream in = new FileInputStream ( fileadd );
            OutputStream out = new FileOutputStream ( fileadd_2 );
            try {
                //创建缓存区域读取字节文件
                byte buffer[] = new byte[ in.available ( ) ];
                //读取字节文件
                in.read ( buffer );
                //对字节进行处理
                System.out.println ( "名称：" + filename.getName ( ) );
                System.out.println ( "大小：" + buffer.length + "kb" );
                String str = new String ( buffer );
                System.out.println ( str );
                //向该路径写入内容
                out.write ( str.getBytes ( ) );
                //关闭流
                in.close ( );
                out.close ( );
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace ( );
        }
    }
}


