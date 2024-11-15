package com.example.restaurantorderform.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.restaurantorderform.data.MenuItemDataSource
import com.example.restaurantorderform.model.MenuItem

@Composable
fun MenuItemGrid(menuItems: List<MenuItem>) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(menuItems.size) { index ->
            MenuItemCard(menuItem = menuItems[index], onItemClick = {})
        }
    }
}

@Composable
fun MenuItemCard(
    menuItem: MenuItem,
    onItemClick: () -> Unit
) {
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Image(
                    painter = painterResource(id = menuItem.image),
                    contentDescription = stringResource(id = menuItem.name),
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = stringResource(id = menuItem.name),
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = stringResource(id = menuItem.description),
                    modifier = Modifier.padding(8.dp)
                )
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$${menuItem.price}",
                        modifier = Modifier.padding(8.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .clickable { onItemClick() }
                    )

                }
            }
        }
    }
}

@Preview
@Composable
fun MenuItemCardPreview() {
    val menuItem = MenuItemDataSource().menuItems[0]
    MenuItemCard(menuItem = menuItem, onItemClick = {})
}

@Preview
@Composable
fun MenuItemGridPreview() {
    val menuItems = MenuItemDataSource().menuItems
    MenuItemGrid(menuItems = menuItems)
}