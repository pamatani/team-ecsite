package jp.co.internous.amethyst.model.form;

import java.io.Serializable;

/**
 * 検索フォーム
 * @author pamatani
 *
 */
public class SearchForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String keywords;
	private int category;
	
	/**
	 * キーワードを取得する
	 * @return キーワード
	 */
	public String getKeywords() {
		return keywords;
	}
	
	/**
	 * キーワードを設定する
	 * @param keywords キーワード
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	/**
	 * カテゴリを取得する
	 * @return カテゴリ
	 */
	public int getCategory() {
		return category;
	}
	
	/**
	 * カテゴリを設定する
	 * @param category カテゴリ
	 */
	public void setCategory(int category) {
		this.category = category;
	}
}
