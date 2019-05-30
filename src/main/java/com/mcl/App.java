package com.mcl;

import com.mcl.config.PropertyKeys;
import com.mcl.models.FindingApiRoot;
import com.mcl.models.Item;
import com.mcl.models.NameValueList;
import com.mcl.models.ShoppingApiRoot;
import com.mcl.requests.Request;
import com.mcl.requests.Response;
import com.mcl.utilities.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
//        String testUpc = "883929032273";
//        Map<String, String> apiParams = new DefaultParameterMapBuilder().getDefaultFindingApiParameterMap();
//        apiParams.put("keywords", testUpc);
//        String baseUrl = PropertyKeys.FIND_API_BASE_URL.getValue();
//        Request req = new RequestBuilder(baseUrl, apiParams).buildRequest();
//        AsyncProcessor processor = new AsyncProcessor();
//        Future<Response> future = processor.execute(req);
//        Response resp = processor.extract(future);
//        FindingApiRoot e = new ResponseDeserializer().deserialize(resp, FindingApiRoot.class);
//        List<Item> itemList = e.getFindCompletedItemsResponse().get(0).getSearchResult().get(0).getItem();
//        Item testItem = itemList.get(0);
//
//        String shopBaseUrl = PropertyKeys.SHOP_API_BASE_URL.getValue();
//        Map<String, String> shopParams = new DefaultParameterMapBuilder().getDefaultShoppingApiParameterMap();
//        shopParams.put("ItemId", testItem.getItemId().get(0));
//        Request shopRequest = new RequestBuilder(shopBaseUrl, shopParams).buildRequest();
//        Response shopResp = processor.extract(processor.execute(shopRequest));
//        ShoppingApiRoot s = new ResponseDeserializer().deserialize(shopResp, ShoppingApiRoot.class);
//        System.out.println(s.getItem().getDescription());
//
//        for (NameValueList nv : s.getItem().getItemSpecifics().getNameValueList()) {
//            System.out.println(nv.getName() + nv.getValue());
//        }
//
//
//        processor.shutdown();

//        String upc = new UserInput().getValidatedInput("Enter 12 or 13 digit upc", )

    }

}
