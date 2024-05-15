package map.project.service

import jakarta.annotation.PostConstruct
import map.project.model.Layout
import map.project.model.Point
import map.project.repository.LayoutRepository
import org.springframework.stereotype.Service

@Service
class LayoutService(
    private val layoutRepository: LayoutRepository
) {

    @PostConstruct
    fun f() {
        val points = listOf(Point(0.0, 0.0), Point(10.0, 10.0))
        val layout = Layout(points = points)
        layoutRepository.save(layout)
    }
}