package br.com.concrete.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.concrete.database.dao.FavoritesDao
import br.com.concrete.database.entity.RepositoryEntity

@Database(entities = [RepositoryEntity::class], version = 1)
//@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoritesDao(): FavoritesDao
}