
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
/**
 * @author �i�쐬�ҁj ��؍L�C
 *  �i�N���X�_�����j Test11.java
 *  �i�����j Test12.java�P�̂ŏ��������s�����N�����Ǝ��Ԃ�\������B
 *  �X�V���� 2016/02/20 �i�X�V�ҁj�F��؍L�C
 */
public class Test12 {
  /*
   *  @param args �N�������� 
   */
  public static void main ( String[] args ) {
    /*
     * �V�X�e�����Ԃ��擾����B
     */
    Date date = new Date();
    /*
     * �擾�����V�X�e�����Ԃ��t�H�[�}�b�g�ɍ��킹��\��������B
     */
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" ); 
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate ); 
  }
}