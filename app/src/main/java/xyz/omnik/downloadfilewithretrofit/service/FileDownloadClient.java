package xyz.omnik.downloadfilewithretrofit.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Rikmen on 15.04.2018.
 */

public interface FileDownloadClient {

    // option 1: a resource relative to your base URL
    @GET("v0/b/cody-tutorials.appspot.com/o/course_one%2Flesson_one%2F1.1%20en.m4a?alt=media&token=748ed42b-4373-44a2-b106-004022f2a7b1")
    Call<ResponseBody> downloadFile();

    // option 2: using a dynamic URL
    @GET
    Call<ResponseBody> downloadFileWithDynamicUrlSync(@Url String fileUrl);
}
