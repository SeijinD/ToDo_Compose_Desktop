package model

data class CategoryList(
    val id: Int = 0,
    val name: String = "",
    val category: Category = Category.OTHER,
    val numberOfTasks: Int = 0
)

enum class Category(
    val categoryIcon: String,
    val wallpaper: String,
    val showDay: Boolean
) {
    MYDAY(
        categoryIcon = "",
        wallpaper = "",
        showDay = true
    ),
    WORK(
        categoryIcon = "",
        wallpaper = "",
        showDay = false
    ),
    UNIVERSITY(
        categoryIcon = "",
        wallpaper = "",
        showDay = false
    ),
    PERSONAL(
        categoryIcon = "",
        wallpaper = "",
        showDay = false
    ),
    OTHER(
        categoryIcon = "images/add.png",
        wallpaper = "",
        showDay = false
    )
}
