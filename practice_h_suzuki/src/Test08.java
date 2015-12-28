/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test08 {
  
  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 静的メゾット
   */
  public static void main( String[] args ) {
    /*
     * 変数を定義する。
     * 加算結果変数は countB とする。
     */
    int sum    = 0;
    int num    = 0;
    int countA = 0;
    int countB = 0;
    
    /*
     * 以下、for文を用いてループ処理を実施する。
     * ZEROから1ずつ加算し、ループ回数が奇数の時に
     * 加算結果変数に1を加算する。
     * ループ回数の値が1000より大きい値になったら
     * 処理を終了する。
     */
    for ( ; countA <= 1000;) { 
        sum += 1;
        num = sum % 2;
        /*
         * ループ回数の奇数判定処理 
         */
        if (num == 1) {
          countB++;
          countA++;
          } else {
        countA++;
        }
    }
    /*
     * 処理結果を表示する。
     */
    System.out.println( "ループ回数");
    System.out.println(  sum );
    System.out.println( "カウント回数");
    System.out.println(  countA );
    System.out.println( "加算結果");
    System.out.println(  countB );
  }

}