/*
 * Solo - A beautiful, simple, stable, fast Java blogging system.
 * Copyright (c) 2010-2018, b3log.org & hacpai.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.b3log.solo.repository.impl;


import org.b3log.latke.model.Plugin;
import org.b3log.latke.repository.AbstractRepository;
import org.b3log.latke.repository.annotation.Repository;
import org.b3log.solo.repository.PluginRepository;


/**
 * Plugin repository.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.0, Jul 21, 2011
 * @since 0.3.1
 */
@Repository
public class PluginRepositoryImpl extends AbstractRepository implements PluginRepository {

    /**
     * Public constructor.
     */
    public PluginRepositoryImpl() {
        super(Plugin.PLUGIN);
    }

}
