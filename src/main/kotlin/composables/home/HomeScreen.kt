package composables.home

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(

) {
    HomeContent(
        items = emptyList()
    )
}

@Composable
fun HomeContent(
    items: List<CategoryList>
) {
    Row(

    ) {
        Column(
            modifier = Modifier
                .weight(0.35f)
                .fillMaxSize()
                .border(width = 2.dp, color = Color.Black),
            horizontalAlignment = Alignment.End
        ) {
            LazyColumn(
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(space = 8.dp)
            ) {
                items(items, key = { item -> item.id }) { categoryList ->
                    CategoryCardItem(categoryList = categoryList)
                }
            }
            IconButton(
                modifier = Modifier
                    .weight(0.1f)
                    .padding(all = 8.dp)
                    .background(
                        shape = CircleShape,
                        color = Color.Magenta
                    ),
                onClick = {}
            ) {
                Image(
                    modifier = Modifier.padding(all = 12.dp),
                    painter = painterResource("images/add.png"),
                    contentDescription = "Add Category"
                )
            }
        }
        Column(
            modifier = Modifier
                .weight(0.65f)
                .fillMaxSize()
                .border(width = 2.dp, color = Color.Black)
        ) {

        }
    }
}

@Composable
fun CategoryCardItem(
    categoryList: CategoryList
) {

}

@Composable
@Preview()
fun HomeContentPreview() {
    HomeContent(items = emptyList())
}