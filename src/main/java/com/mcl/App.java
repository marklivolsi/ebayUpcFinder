package com.mcl;

import com.mcl.config.PropertyKeys;
import com.mcl.models.*;
import com.mcl.requests.Request;
import com.mcl.requests.Response;
import com.mcl.utilities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String upc = new UserInput().getValidatedInput("UPC", str -> new UpcStringValidator().validate(str));
        UpcProduct prod = new UpcProduct(upc);
        ProductDataFetcher fetcher = new ProductDataFetcher();
        fetcher.fetchAllData(prod);
//        for (Item item : prod.getFindingApiRoot().getFindCompletedItemsResponse().get(0).getSearchResult().get(0).getItem()) {
//            System.out.println(item.getTitle());
//        }
//        for (ShoppingApiRoot item : prod.getItemIdResponseMap().values()) {
//            System.out.println(item.getItem().getTitle());
//        }
        List<Item> itemList = prod.getFindingApiRoot()
                                  .getFindCompletedItemsResponse().get(0)
                                  .getSearchResult().get(0)
                                  .getItem();
        for (Item item : itemList) {
            String desc = item.getItemDetailsRoot()
                              .getItem()
                              .getTitle();
            System.out.println(desc);
        }

//        String upc = "883929032273";
//        AsyncProcessor processor = new AsyncProcessor();
//        String baseUrl = PropertyKeys.FIND_API_BASE_URL.getValue();
//        Map<String, String> params = new DefaultParameterMapBuilder().getDefaultFindingApiParameterMap();
//        params.put("keywords", upc);
//        Request request = new RequestBuilder(baseUrl, params).buildRequest();
//        Response response = processor.extract(processor.execute(request));
//        System.out.println(response.getBodyAsString());
//        processor.shutdown();
    }

}
