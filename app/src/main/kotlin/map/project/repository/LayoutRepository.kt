package map.project.repository

import map.project.model.Layout
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LayoutRepository : JpaRepository<Layout, Long>