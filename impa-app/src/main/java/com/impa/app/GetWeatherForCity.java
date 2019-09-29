package com.impa.app;

import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetWeatherForCity

{

    public static final int CITY_ID_AVEIRO = 1010500;

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            try {
	        	Response<IpmaCityForecast> apiResponse = callSync.execute();
	            IpmaCityForecast forecast = apiResponse.body();
	            
	            List<CityForecast> lista = forecast.getData();
	            for(CityForecast c : lista) {
	            	System.out.println("forecast is: ");
	            	System.out.println("\tprecipitaProb:" + c.getPrecipitaProb());
	            	System.out.println("\ttMin:" + c.getTMin());
	            	System.out.println("\ttMax:" + c.getTMax());
	            	System.out.println("\tpredWindDir:" + c.getPredWindDir());
	            	System.out.println("\tidWeatherType:" + c.getIdWeatherType());
	            	System.out.println("\tclassWindSpeed:" + c.getClassWindSpeed());
	            	System.out.println("\tlongitude:" + c.getLongitude());
	            	System.out.println("\tforecastDate:" + c.getForecastDate());
	            	System.out.println("\tlatitude:" + c.getLatitude());
	            }
            }catch(IllegalThreadStateException e) {
            	
            }
            
            
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }
}
