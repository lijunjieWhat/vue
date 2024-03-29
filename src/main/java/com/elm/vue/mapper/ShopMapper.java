package com.elm.vue.mapper;


import com.elm.vue.entity.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ShopMapper {

     int addShop(Shop shop);

     Map<String,Object> queryShopById(Integer id);

     List<Map<String,Object>> queryShops(@Param("name") String name);

     Integer removeShopById(Integer id);
}
