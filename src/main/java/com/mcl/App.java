package com.mcl;

import com.mcl.models.*;
import com.mcl.utilities.ProductDataFetcher;
import com.mcl.utilities.StringUtils;
import com.mcl.utilities.UpcStringValidator;
import com.mcl.utilities.UserInput;

import java.io.IOException;
import java.util.ArrayList;
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
        for (ShoppingApiRoot item : prod.getItemIdResponseMap().values()) {
            System.out.println(item.getItem().getTitle());
        }
    }

}
