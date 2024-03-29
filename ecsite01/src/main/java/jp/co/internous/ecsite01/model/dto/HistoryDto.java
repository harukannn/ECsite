package jp.co.internous.ecsite01.model.dto;

import java.sql.Timestamp;


import java.text.SimpleDateFormat;

import jp.co.internous.ecsite01.model.entity.Purchase;

public class HistoryDto {
	
	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private String createdAt;
	
	public HistoryDto() {}
	public HistoryDto(Purchase entity) {
			this.id = entity.getId();
			this.userId = entity.getUserId();
			this.goodsName = entity.getGoodsName();
			this.itemCount = entity.getItemCount();
			this.total = entity.getTotal();
			
			Timestamp d  = entity.getCreatedAt();
			SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			this.createdAt = f.format(d);
	}
			
			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			
			public long getUserId() {
				return userId;
			}
			public void setUserId(long userid) {
				this.userId = userid;
			}
			
			public long getGoodsId() {
				return goodsId;
			}
			public void setGoodsId(long goodsid) {
				this.goodsId = goodsid;
			}
			
			public String getGoodsName() {
				return goodsName;
			}
			public void setGoodsName(String goodsName) {
				this.goodsName = goodsName;
			}
			
			public long getItemCount() {
				return itemCount;
			}
			public void setItemCount(long itemCount) {
				this.itemCount = itemCount;
			}
			
			public long getTotal() {
				return total;
			}
			public void setTotal(long total) {
				this.total = total;
			}
			
			public String getCreatedAt() {
				return createdAt;
			}
			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}
			
	}
	
