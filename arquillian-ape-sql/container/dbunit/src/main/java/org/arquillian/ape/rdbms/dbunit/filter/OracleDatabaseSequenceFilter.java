/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.ape.rdbms.dbunit.filter;

import java.sql.SQLException;
import org.arquillian.ape.rdbms.dbunit.DataSetUtils;
import org.dbunit.database.DatabaseSequenceFilter;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;

public class OracleDatabaseSequenceFilter extends DatabaseSequenceFilter {

    public OracleDatabaseSequenceFilter(IDatabaseConnection connection, String[] tableNames)
        throws DataSetException, SQLException {
        super(connection, DataSetUtils.tableNamesInUpperCase(tableNames));
    }

    public OracleDatabaseSequenceFilter(IDatabaseConnection connection) throws DataSetException, SQLException {
        super(connection);
    }
}
