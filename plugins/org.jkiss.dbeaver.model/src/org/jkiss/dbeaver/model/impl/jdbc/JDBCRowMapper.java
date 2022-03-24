/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2022 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.impl.jdbc;

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;

import java.sql.ResultSet;

/**
 * An interface used for mapping rows of a ResultSet on a per-row basis.
 * Implementations of this interface perform the actual work of mapping each row to a result object, but don't need to worry about exception handling.
 *
 * <p>
 * Inspired by
 * <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html">RowMapper</a>
 * from Spring JDBC.
 *
 * @param <T>
 */
@FunctionalInterface
public interface JDBCRowMapper<T> {
    @Nullable
    T mapRow(@NotNull ResultSet resultSet) throws DBException;
}
