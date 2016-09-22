import java.math.BigDecimal;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
/**
 * @author （作成者） 鈴木広気
 *  （クラス論理名） Test11.java
 *  （説明） Test11.java単体で0.1を10回足した値を10倍した値を表示する。
 *  更新履歴 2016/02/20 （更新者）：鈴木広気
 */
public class Test11 {
  /*
   * 
   *  @param args 起動時引数 
   */
  public static void main ( String[] args ) {
    /*
     * 変数を定義する。
     */
    BigDecimal sumA =  new BigDecimal("0");
    BigDecimal sumB =  new BigDecimal("0.1");
    BigDecimal sumC =  new BigDecimal("10");
    /*
     * 以下、for文を用いてループ処理を実施する。
     */
    for(int i = 1 ; i < 11 ; i++){
      sumA = sumA.add( sumB );
    }
    /*
     * ループ処理にて加算した結果を10倍する。
     */
    sumA = sumA.multiply( sumC );
    /*
     * 加算結果を表示する。
     */
    System.out.println( "加算結果");
    System.out.println(   sumA  );
  }
}