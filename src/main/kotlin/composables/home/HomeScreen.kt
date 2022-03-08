package composables.home

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import model.CategoryList

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
                contentPadding = PaddingValues(all = 4.dp)
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
                        color = Color.Gray
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
            Column(
                modifier = Modifier
                    .weight(0.35f)
                    .fillMaxSize()
            ) {
                Row(

                ) {

                }
            }
            Column(
                modifier = Modifier
                    .weight(0.65f)
                    .fillMaxSize()
            ) {

            }
        }
    }
}

@Composable
fun CategoryCardItem(
    categoryList: CategoryList
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(width = 1.dp, color = Color.Black),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .background(color = Color.Gray, shape = RoundedCornerShape(size = 8.dp))
            .clip(shape = RoundedCornerShape(size = 8.dp))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .weight(0.2f)
                    .padding(all = 8.dp),
                painter = painterResource(categoryList.category.categoryIcon),
                contentDescription = "Category Icon"
            )
            Text(
                modifier = Modifier
                    .weight(0.7f)
                    .padding(all = 8.dp),
                text = categoryList.name,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                modifier = Modifier
                    .weight(0.1f)
                    .padding(all = 8.dp),
                text = "${categoryList.numberOfTasks}",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
@Preview()
fun wHomeContentPreview() {
    HomeContent(
        items = listOf(
            CategoryList(0, "Work"),
            CategoryList(1, "University"),
            CategoryList(2, "Personal")
        )
    )
}