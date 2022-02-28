package jp.co.internous.amethyst.model.domain;

import java.sql.Timestamp;

/**
 * mst_categoryのドメイン
 * @author pamatani
 *
 */
public class MstCategory {
	private int id;
	private String categoryName;
	private String categoryDescription;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/**
	 * IDを取得する
	 * @return ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * IDを設定する
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * カテゴリ名を取得する
	 * @return カテゴリ名
	 */
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * カテゴリ名を設定する 
	 * @param categoryName カテゴリ名
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * カテゴリ詳細を取得する
	 * @return カテゴリ詳細
	 */
	public String getCategoryDescription() {
		return categoryDescription;
	}
	
	/**
	 * カテゴリ詳細を設定する
	 * @param categoryDescription カテゴリ詳細
	 */
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	/**
	 * 登録日時を取得する
	 * @return 登録日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * 登録日時を設定する
	 * @param createdAt 登録日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * 更新日時を取得する
	 * @return 更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * 更新日時を設定する
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
