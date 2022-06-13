package kr.ac.mju.k1.k1chellin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {
    @Query("SELECT s FROM Store s WHERE s.name = :keyword OR s.storeName = :keyword OR s.foodCf = :keyword")
    List<Store> findAllByKeyword(@Param("keyword") String keyword);
}
