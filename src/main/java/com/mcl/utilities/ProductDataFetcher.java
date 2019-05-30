package com.mcl.utilities;

import com.mcl.models.UpcProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class ProductDataFetcher {

    public void fetchAllData(UpcProduct upcProduct) throws ExecutionException, InterruptedException, IOException {
        upcProduct.fetchAllData();
    }

    public void fetchAllData(ArrayList<UpcProduct> upcProducts) throws ExecutionException, InterruptedException, IOException {
        for (UpcProduct upcProduct : upcProducts) {
            upcProduct.fetchAllData();
        }
    }

}
