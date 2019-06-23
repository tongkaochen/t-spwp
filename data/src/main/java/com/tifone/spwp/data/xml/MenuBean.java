package com.tifone.spwp.data.xml;

import android.view.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Create by Tifone on 2019/6/23.
 */
public class MenuBean {
    public String id;
    public int date;
    private List<Price> prices;
    private List<Material> materials;

    public MenuBean(String id, int date) {
        prices = new ArrayList<>();
        materials = new ArrayList<>();
        this.id = id;
        this.date = date;
    }

    public void addPrice(Price price) {
        int findId = -1;
        for (Price item : prices) {
            if (item.date == price.date) {
                findId = prices.indexOf(item);
                break;
            }
        }
        if (findId != -1) {
            prices.remove(findId);
            prices.add(price);
        }
        Collections.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.date - o2.date;
            }
        });
    }


    private void addMaterial(Material material) {
        int findId = -1;
        for (Material item : materials) {
            if (item.id == material.id) {
                findId = materials.indexOf(item);
                break;
            }
        }
        if (findId != -1) {
            materials.remove(findId);
            materials.add(material);
        }
        Collections.sort(materials, new Comparator<Material>() {
            @Override
            public int compare(Material o1, Material o2) {
                return o1.id - o2.id;
            }
        });
    }
    public List<Material> getMaterials() {
        return materials;
    }

    class Price {
        int date;
        int value;
        Price(int date, int value) {
            this.date = date;
            this.value = value;
        }
    }
    class Material {
        int id;
        String name;
        int price;
        Usage usage;
        String comment;
    }
    class Usage {
        String type;
        int value;
    }
}
