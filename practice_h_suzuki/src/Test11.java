import java.math.BigDecimal;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
/**
 * @author �i�쐬�ҁj ��؍L�C
 *  �i�N���X�_�����j Test11.java
 *  �i�����j Test11.java�P�̂�0.1��10�񑫂����l��10�{�����l��\������B
 *  �X�V���� 2016/02/20 �i�X�V�ҁj�F��؍L�C
 */
public class Test11 {
  /*
   * 
   *  @param args �N�������� 
   */
  public static void main ( String[] args ) {
    /*
     * �ϐ����`����B
     */
    BigDecimal sumA =  new BigDecimal("0");
    BigDecimal sumB =  new BigDecimal("0.1");
    BigDecimal sumC =  new BigDecimal("10");
    /*
     * �ȉ��Afor����p���ă��[�v���������{����B
     */
    for(int i = 1 ; i < 11 ; i++){
      sumA = sumA.add( sumB );
    }
    /*
     * ���[�v�����ɂĉ��Z�������ʂ�10�{����B
     */
    sumA = sumA.multiply( sumC );
    /*
     * ���Z���ʂ�\������B
     */
    System.out.println( "���Z����");
    System.out.println(   sumA  );
  }
}