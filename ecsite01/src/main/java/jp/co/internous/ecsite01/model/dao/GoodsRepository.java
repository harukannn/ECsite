package jp.co.internous.ecsite01.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite01.model.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Long>{

}
