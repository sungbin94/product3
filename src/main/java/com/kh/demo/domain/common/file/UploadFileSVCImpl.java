package com.kh.demo.domain.common.file;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileSVCImpl implements UploadFileSVC{
  /**
   * 업로드 파일 등록 - 단건
   *
   * @param file 첨부파일 단건
   * @return 파일Id
   */
  @Override
  public Long addFile(MultipartFile file) {
    return null;
  }
}
