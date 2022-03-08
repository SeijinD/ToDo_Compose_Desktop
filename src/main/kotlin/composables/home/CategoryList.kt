package composables.home

data class CategoryList(
    val id: Int = 0,
    val name: String = "",
    val category: Category = Category.OTHER,
    val numberOfTasks: Int = 0
)

enum class Category {
    WORK, UNIVERSITY, PERSONAL, OTHER
}
