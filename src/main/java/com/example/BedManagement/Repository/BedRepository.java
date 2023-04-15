package com.example.BedManagement.Repository;
import com.example.BedManagement.Model.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BedRepository extends JpaRepository<Bed,Integer> {

          @Query(value = "SELECT * FROM bed where status=:status", nativeQuery = true)
          List<Bed> getBed(@Param(value = "status") boolean status);
       /*  @Query(value = "UPDATE bed SET status=:true WHERE id=:bed_id;",nativeQuery = true)
          void bedUpdate(@Param(value = "bed_id")int id );*/
}
