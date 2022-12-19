package victor.pmdm_retrofit_api_users.conexiones;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import victor.pmdm_retrofit_api_users.constantes.Constantes;

public class RetrofitObject {
    public static Retrofit getConexion() {
        return new Retrofit.Builder()
                .baseUrl(Constantes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
