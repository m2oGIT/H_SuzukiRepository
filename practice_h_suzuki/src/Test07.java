/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者） 鈴木広気
 *  （クラス論理名） Test07.java
 *  （説明） １つ目のメソッドはTest07.java単体で１から１００まで加算処理を実施する。
 *  　　　　 ２つ目のメソッドはTest10.javaから渡された２つの引数の間の値を加算し、
 *  　　　　 その結果をTest10.javaに返す処理を実施する。
 *  更新履歴 2016/02/20 （更新者）：鈴木広気
 */
public class Test07 {
  /*
   * １つ目のメソッドはTest07単体で処理を実施した場合に
   * １から１００までを加算するもの。
   *  @param args 起動時引数 
   */
  public static void main( String[] args ) {
    /*
     * 変数を定義する。
     */
    int sum   = 100;
    int countB = 0;
    /*
     * 以下、for文を用いてループ処理を実施する。
     * ZEROから1ずつ加算し、100より大きい値になったら
     * ループ処理を終了する。
     */
    for (int i = 1; i <= sum; i++) {
         countB += i;
    }
    /*
     * 加算結果を表示する。
     */
    System.out.println( "加算結果");
    System.out.println(  countB );
  }
  /*
   *２つ目のメソッドはTest10から渡された２つの値の間の数を
   *加算し、その結果を戻り値として返すもの。
   *
   * 戻り値とする引数を定義する。
   */
   private static int sumC = 0;
   /*
    *  @return  sumC 戻り値
    *  @param  i  引数
    *  @param  j  引数
    * 以下、Test10からの加算処理を実施する。
    */
   public static  int identifier(int i , int j  ) {
     /*
      * 加算結果を格納する引数を定義する。
      * 
      */
     int countA = 0;
     /*
      *以下、２つの値をもとに加算処理を実施する。 
      */
     for ( ; i <= j;) {
          countA += i;
          i++;
     } 
     /*
      * 加算結果を表示する。
      */
     System.out.println( "加算結果");
     System.out.println(  countA );   
     /*
      * Test10に加算結果を戻す。
      */
     return sumC;
   }  
}