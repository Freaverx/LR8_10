package Buf_RW_2;

public class Buf_RW_2 {
    public static void main(String[] args) { BufferedReader br = null;
        PrintWriter out=null;
        try {
// Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\MyFile1.txt"),"cp1251"));

            PrintWriter out = new PrintWriter("E:\\MyFile2.txt","cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0; String s;
            while ((s = br.readLine()) != null) { lineCount++; out.println(lineCount + ": " + s);
            }
        } catch (IOException e) { System.out.println("Ошибка !!!!!!!!");	}
        finally{ br.close();
            out.flush();
            out.close();
        }}}

}
