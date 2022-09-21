package com.carmesin.pos_sys.Pos.Repository;

import com.carmesin.pos_sys.Pos.Model.priceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface pricesRepository extends JpaRepository<priceModel,Long> {

    @Query(value = "SELECT * FROM prices p WHERE p.belonging = ?1", nativeQuery = true)
    List<priceModel> selectChoice(String choice);

}
