package jp.co.internous.amethyst.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.amethyst.model.domain.MstProduct;

/**
* mst_productにアクセスするDAO
* @author pamatani
*
*/
@Mapper
public interface MstProductMapper {
	
	/**
	* 商品情報を取得する
	* @return 商品情報リスト
	*/
	@Select("SELECT * FROM mst_product")
	List<MstProduct> find();
	
	/**
	* キーワード（商品名）を条件に商品情報を取得する
	* @return 商品情報リスト
	*/
	List<MstProduct> findByProductName(@Param("keywords") String[] keywords);
	
	/**
	* カテゴリとキーワード（商品名）を条件に商品情報を取得する
	* @return 商品情報リスト
	*/
	List<MstProduct> findByCategoryAndProductName(@Param("category") int category, @Param("keywords") String[] keywords);
}
