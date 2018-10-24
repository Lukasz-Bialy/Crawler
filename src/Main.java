import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static java.rmi.server.LogStream.log;

public class Main {
    public static void fields(PrintWriter file, Elements name, Elements brand, String category, Elements price, Elements img_Url, Elements description) {
        Random is_in_stock = new Random();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        file.print(name.text() + ";");//sku
        file.print(";");//store_view_code
        file.print("Default"+";");//attribute_set_code
        file.print("simple"+";");//product_type
        file.print("Default Category/Military,Default Category/Military/"+category + ";");//categories
        file.print("base" + ";");//product_websites
        file.print(name.text() + ";");//name
        file.print(description.text()+";");//description
        file.print(";");//short_description
        file.print(";");//weight
        file.print("1" + ";");//product_online
        file.print("Taxable Goods" + ";");//tax_class_name
        file.print("Catalog, Search" + ";");//visibility
        file.print(price.text().split(" ")[0].replaceAll(",",".") + ";");//price
        file.print(";");//special_price
        file.print(";");//special_price_from_date
        file.print(";");//special_price_to_date
        file.print(name.text().replaceAll(" ","-")+";");//url_key
        file.print(";");//meta_title
        file.print(";");//meta_keywords
        file.print(";");//meta_description
        file.print(img_Url.attr("abs:href") + ";");//base_image
        file.print(";");//base_image_label
        file.print(img_Url.attr("abs:href") + ";");//small_image
        file.print(";");//small_image_label
        file.print(img_Url.attr("abs:href") + ";");//thumbnail_image
        file.print(";");//thumbnail_image_label
        file.print(";");//swatch_image
        file.print(";");//swatch_image_label
        file.print(dateFormat.format(date)+";");//created_at
        file.print(dateFormat.format(date)+";");//updated_at
        file.print(";");//new_from_date
        file.print(";");//new_to_date
        file.print("Block after Info Column"+";");//display_product_options_in
        file.print(";");//map_price
        file.print(";");//msrp_price
        file.print(";");//map_enabled
        file.print(";");//gift_message_available
        file.print(";");//custom_design
        file.print(";");//custom_design_from
        file.print(";");//custom_design_to
        file.print(";");//custom_layout_update
        file.print(";");//page_layout
        file.print(";");//product_options_container
        file.print(";");//msrp_display_actual_price_type
        file.print(";");//country_of_manufacture
        file.print(";");//additional_attributes
        file.print("100"+";");//qty
        file.print("0"+";");//out_of_stock_qty
        file.print("1"+";");//use_config_min_qty
        file.print("0"+";");//is_qty_decimal
        file.print("0"+";");//allow_backorders
        file.print("1"+";");//use_config_backorders
        file.print("1"+";");//min_cart_qty
        file.print("1"+";");//use_config_min_sale_qty
        file.print("0"+";");//max_cart_qty
        file.print("1"+";");//use_config_max_sale_qty
        file.print(is_in_stock.nextInt(25) + 5+";");//is_in_stock
        file.print(";");//notify_on_stock_below
        file.print("1"+";");//use_config_notify_stock_qty
        file.print("0"+";");//manage_stock
        file.print("1"+";");//use_config_manage_stock
        file.print("1"+";");//use_config_qty_increments
        file.print("0"+";");//qty_increments
        file.print("1"+";");//use_config_enable_qty_inc
        file.print("0"+";");//enable_qty_increments
        file.print("0"+";");//is_decimal_divided
        file.print("0"+";");//website_id
        file.print(";");//related_skus
        file.print(";");//related_position
        file.print(";");//crosssell_skus
        file.print(";");//crosssell_position
        file.print(";");//upsell_skus
        file.print(";");//upsell_position
        file.print(img_Url.attr("abs:href") + ";");//additional_images
        file.print("Image;");//additional_image_labels
        file.print(";");//hide_from_product_page
        file.print(";");//custom_options
        file.print(";");//bundle_price_type
        file.print(";");//bundle_sku_type
        file.print(";");//bundle_price_view
        file.print(";");//bundle_weight_type
        file.print(";");//bundle_values
        file.print(";");//bundle_shipment_type
        file.print(";");//configurable_variations
        file.print(";");//configurable_variation_labels
        file.println("");//associated_skus
        
        //file.print(brand.text() + ";");//Producent
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("Products.csv");
        zapis.println("sku;store_view_code;attribute_set_code;product_type;categories;product_websites;name;description;short_description;weight;product_online;tax_class_name;visibility;price;special_price;special_price_from_date;special_price_to_date;url_key;meta_title;meta_keywords;meta_description;base_image;base_image_label;small_image;small_image_label;thumbnail_image;thumbnail_image_label;swatch_image;swatch_image_label;created_at;updated_at;new_from_date;new_to_date;display_product_options_in;map_price;msrp_price;map_enabled;gift_message_available;custom_design;custom_design_from;custom_design_to;custom_layout_update;page_layout;product_options_container;msrp_display_actual_price_type;country_of_manufacture;additional_attributes;qty;out_of_stock_qty;use_config_min_qty;is_qty_decimal;allow_backorders;use_config_backorders;min_cart_qty;use_config_min_sale_qty;max_cart_qty;use_config_max_sale_qty;is_in_stock;notify_on_stock_below;use_config_notify_stock_qty;manage_stock;use_config_manage_stock;use_config_qty_increments;qty_increments;use_config_enable_qty_inc;enable_qty_increments;is_decimal_divided;website_id;related_skus;related_position;crosssell_skus;crosssell_position;upsell_skus;upsell_position;additional_images;additional_image_labels;hide_from_product_page;custom_options;bundle_price_type;bundle_sku_type;bundle_price_view;bundle_weight_type;bundle_values;bundle_shipment_type;configurable_variations;configurable_variation_labels;associated_skus");
        String category;
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.militaria.pl/odziez_c205.xml").get();
            Elements categories = doc.select("div.category-grid div.photo a");//kategorie
            for (Element e : categories) {
                category = e.attr("title");
                category = category.substring(0, category.indexOf(","));
                Document doc1 = Jsoup.connect(e.attr("abs:href")).get();
                Elements subpages = doc1.select("div.top-list-navigator li.tab a");//podstrony
                for (Element r : subpages) {
                    Document doc2 = Jsoup.connect(r.attr("abs:href")).get();
                    Elements products = doc2.select("div.products a.photo"); //produkty
                    for (Element t : products) {
                        doc = Jsoup.connect(t.attr("abs:href")).get();
                        Elements name = doc.select("header h1");//dane
                        Elements brand = doc.select("header h2 span");
                        Elements price = doc.select("div.price-and-ksk div.price");
                        Elements img_Url = doc.select("div.item a");
                        Elements description = doc.select("div#product_description");
                        fields(zapis, name, brand, category, price, img_Url, description);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        zapis.close();
    }
}
