
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
/**
 * @author （作成者） 鈴木広気
 *  （クラス論理名） Test11.java
 *  （説明） Test12.java単体で処理を実行した年月日と時間を表示する。
 *  更新履歴 2016/02/20 （更新者）：鈴木広気
 */
public class Test12 {
  /*
   *  @param args 起動時引数 
   */
  public static void main ( String[] args ) {
    /*
     * システム時間を取得する。
     */
    Date date = new Date();
    /*
     * 取得したシステム時間をフォーマットに合わせれ表示させる。
     */
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" ); 
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate ); 
  }
}