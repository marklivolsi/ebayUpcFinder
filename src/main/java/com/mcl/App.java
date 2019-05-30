package com.mcl;

import com.mcl.config.PropertyKeys;
import com.mcl.models.FindingApiRoot;
import com.mcl.models.Item;
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
        String testUpc = "883929032273";
        Map<String, String> apiParams = new DefaultParameterMapBuilder().getDefaultFindingApiParameterMap();
        apiParams.put("keywords", testUpc);
        String baseUrl = PropertyKeys.FIND_API_BASE_URL.getValue();
        Request req = new RequestBuilder(baseUrl, apiParams).buildRequest();
        AsyncProcessor processor = new AsyncProcessor();
        Future<Response> future = processor.execute(req);
        Response resp = processor.extract(future);
        FindingApiRoot e = new ResponseDeserializer().deserialize(resp, FindingApiRoot.class);
        List<Item> itemList = e.getFindCompletedItemsResponse().get(0).getSearchResult().get(0).getItem();
        for (Item item : itemList) {
            System.out.println(item.getItemId().get(0));
            System.out.println(item.getTitle().get(0));
        }
    }

}
