package com.mcl;

import com.mcl.config.PropertyKeys;
import com.mcl.models.Item;
import com.mcl.models.ItemListingForSerialization;
import com.mcl.models.UpcProduct;
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
//        ArrayList<ItemListingForSerialization> itemList = new ArrayList<>();
        ArrayList<String> json = new ArrayList<>();
        Serializer serializer = new Serializer();
        for (Item i : prod.getFindingApiRoot().getFindCompletedItemsResponse().get(0).getSearchResult().get(0).getItem()) {
            json.add(serializer.serializeToJson(new ItemListingForSerialization(i)));
//            itemList.add(new ItemListingForSerialization(i));
        }
//        System.out.println(itemList);
        for (String s : json) {
            System.out.println(s);
        }

//        AsyncProcessor processor = new AsyncProcessor(30);
//        String itemId = "113702043441";
//        Map<String, String> params = new ApiParameterMapBuilder().getDefaultShoppingApiParameterMap();
//        params.put("ItemID", itemId);
//        Request request = new RequestBuilder(PropertyKeys.SHOP_API_BASE_URL.getValue(), params).buildRequest();
//        Response response = processor.extract(processor.execute(request));
//        System.out.println(response.getBodyAsString());

//        List<Item> itemList = prod.getFindingApiRoot()
//                                  .getFindCompletedItemsResponse().get(0)
//                                  .getSearchResult().get(0)
//                                  .getItem();
//        for (Item item : itemList) {
//            String desc = item.getItemDetailsRoot()
//                              .getItem()
//                              .getTitle();
//            System.out.println(desc);
//        }

//        String upc = "883929032273";
//        AsyncProcessor processor = new AsyncProcessor();
//        String baseUrl = PropertyKeys.FIND_API_BASE_URL.getValue();
//        Map<String, String> params = new ApiParameterMapBuilder().getDefaultFindingApiParameterMap();
//        params.put("keywords", upc);
//        Request request = new RequestBuilder(baseUrl, params).buildRequest();
//        Response response = processor.extract(processor.execute(request));
//        System.out.println(response.getBodyAsString());
//        processor.shutdown();
    }

}
