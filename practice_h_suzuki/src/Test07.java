/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁj ��؍L�C
 *  �i�N���X�_�����j Test07.java
 *  �i�����j �P�ڂ̃��\�b�h��Test07.java�P�̂łP����P�O�O�܂ŉ��Z���������{����B
 *  �@�@�@�@ �Q�ڂ̃��\�b�h��Test10.java����n���ꂽ�Q�̈����̊Ԃ̒l�����Z���A
 *  �@�@�@�@ ���̌��ʂ�Test10.java�ɕԂ����������{����B
 *  �X�V���� 2016/02/20 �i�X�V�ҁj�F��؍L�C
 */
public class Test07 {
  /*
   * �P�ڂ̃��\�b�h��Test07�P�̂ŏ��������{�����ꍇ��
   * �P����P�O�O�܂ł����Z������́B
   *  @param args �N�������� 
   */
  public static void main( String[] args ) {
    /*
     * �ϐ����`����B
     */
    int sum   = 100;
    int countB = 0;
    /*
     * �ȉ��Afor����p���ă��[�v���������{����B
     * ZERO����1�����Z���A100���傫���l�ɂȂ�����
     * ���[�v�������I������B
     */
    for (int i = 1; i <= sum; i++) {
         countB += i;
    }
    /*
     * ���Z���ʂ�\������B
     */
    System.out.println( "���Z����");
    System.out.println(  countB );
  }
  /*
   *�Q�ڂ̃��\�b�h��Test10����n���ꂽ�Q�̒l�̊Ԃ̐���
   *���Z���A���̌��ʂ�߂�l�Ƃ��ĕԂ����́B
   *
   * �߂�l�Ƃ���������`����B
   */
   private static int sumC = 0;
   /*
    *  @return  sumC �߂�l
    *  @param  i  ����
    *  @param  j  ����
    * �ȉ��ATest10����̉��Z���������{����B
    */
   public static  int identifier(int i , int j  ) {
     /*
      * ���Z���ʂ��i�[����������`����B
      * 
      */
     int countA = 0;
     /*
      *�ȉ��A�Q�̒l�����Ƃɉ��Z���������{����B 
      */
     for ( ; i <= j;) {
          countA += i;
          i++;
     } 
     /*
      * ���Z���ʂ�\������B
      */
     System.out.println( "���Z����");
     System.out.println(  countA );   
     /*
      * Test10�ɉ��Z���ʂ�߂��B
      */
     return sumC;
   }  
}