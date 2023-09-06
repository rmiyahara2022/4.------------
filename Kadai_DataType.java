
public class Kadai_DataType {
// 課題
/* 以下のプログラムを実行した場合は、line1及びline2でコンパイルエラーが発生する。（回答：3）
line1：float型からint型への変換、line2：double型からfloat型への変換

  public static void main(String[] args) {
  int iNum = 5;
  float fNum = 3.4f;
  double dNum = 7.9;
  if (iNum > 5) {
   iNum = fNum; // line 1 
  } else {
   fNum = dNum; // line 2 
  } 
 }
 
 エラー解消のためには、型をキャストで明示する必要がある。
  */

    public static void main(String[] args) {
    int iNum = 5;
    float fNum = 3.4f;
    double dNum = 7.9;
    if (iNum > 5) {
        iNum = (int)fNum; // line 1 
    } else {
        fNum = (float)dNum; // line 2 
    }
    System.out.println("int型：" + iNum);
    System.out.println("float型：" + fNum);
  }
}