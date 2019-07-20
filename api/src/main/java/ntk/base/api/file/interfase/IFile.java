package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface IFile {

    @Multipart
    @POST("api/upload/")
    Observable<String> uploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);
}