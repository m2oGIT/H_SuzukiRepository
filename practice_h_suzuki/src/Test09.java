/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param  args �ÓI���]�b�g
   */
  public static void main( String[] args ) {
    
    /*
     * �ϐ����`����B
     */
    int sum   = 0;
    int count = 0;
    /*
     * ���s�����������[�J�������Ɉڑ�����B
     */
    count = Integer.parseInt(args[0]);
    /*
     * �ȉ��Afor����p���ă��[�v���������{����B
     * ZERO����1�����Z���A���s�������܂�
     * ���[�v�������I������B
     */
    for ( ; sum != count; ) {
        sum += 1;
    }
    /*
     * ���Z���ʂ�\������B
     */
    System.out.println( "���Z����");
    System.out.println(  sum );
  }
  
}