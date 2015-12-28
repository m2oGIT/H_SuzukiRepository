/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test09 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param  args 静的メゾット
   */
  public static void main( String[] args ) {
    
    /*
     * 変数を定義する。
     */
    int sum   = 0;
    int count = 0;
    /*
     * 実行時引数をローカル引数に移送する。
     */
    count = Integer.parseInt(args[0]);
    /*
     * 以下、for文を用いてループ処理を実施する。
     * ZEROから1ずつ加算し、実行時引数まで
     * ループ処理を終了する。
     */
    for ( ; sum != count; ) {
        sum += 1;
    }
    /*
     * 加算結果を表示する。
     */
    System.out.println( "加算結果");
    System.out.println(  sum );
  }
  
}