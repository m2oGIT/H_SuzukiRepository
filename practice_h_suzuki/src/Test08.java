/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test08 {
  
  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �ÓI���]�b�g
   */
  public static void main( String[] args ) {
    /*
     * �ϐ����`����B
     * ���Z���ʕϐ��� countB �Ƃ���B
     */
    int sum    = 0;
    int num    = 0;
    int countA = 0;
    int countB = 0;
    
    /*
     * �ȉ��Afor����p���ă��[�v���������{����B
     * ZERO����1�����Z���A���[�v�񐔂���̎���
     * ���Z���ʕϐ���1�����Z����B
     * ���[�v�񐔂̒l��1000���傫���l�ɂȂ�����
     * �������I������B
     */
    for ( ; countA <= 1000;) { 
        sum += 1;
        num = sum % 2;
        /*
         * ���[�v�񐔂̊���菈�� 
         */
        if (num == 1) {
          countB++;
          countA++;
          } else {
        countA++;
        }
    }
    /*
     * �������ʂ�\������B
     */
    System.out.println( "���[�v��");
    System.out.println(  sum );
    System.out.println( "�J�E���g��");
    System.out.println(  countA );
    System.out.println( "���Z����");
    System.out.println(  countB );
  }

}