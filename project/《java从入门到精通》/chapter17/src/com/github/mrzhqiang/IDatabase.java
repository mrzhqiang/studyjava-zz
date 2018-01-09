package com.github.mrzhqiang;

import java.sql.Connection;

public interface IDatabase {
    Connection connect() throws Exception;
}
