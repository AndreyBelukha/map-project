package map.project.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
data class Layout(
    @Id
    val id: Long = -1,

    @JdbcTypeCode(SqlTypes.JSON)
    val points: List<Point>
)