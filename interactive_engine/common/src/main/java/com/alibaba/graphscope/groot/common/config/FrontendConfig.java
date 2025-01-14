/**
 * Copyright 2020 Alibaba Group Holding Limited.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.graphscope.groot.common.config;

public class FrontendConfig {
    public static final Config<String> AUTH_USERNAME = Config.stringConfig("auth.username", "");

    public static final Config<String> AUTH_PASSWORD = Config.stringConfig("auth.password", "");

    //
    public static final Config<Integer> FRONTEND_SERVICE_PORT =
            Config.intConfig("frontend.service.port", 55556);
    public static final Config<Integer> GREMLIN_SERVER_PORT =
            Config.intConfig("gremlin.server.port", 8182);

    public static final Config<Integer> FRONTEND_SERVICE_THREAD_COUNT =
            Config.intConfig(
                    "frontend.service.thread.count",
                    Math.max(Math.min(Runtime.getRuntime().availableProcessors() / 2, 64), 4));

    public static final Config<Boolean> ENABLE_HASH_GENERATE_EID =
            Config.boolConfig("enable.hash.generate.eid", false);

    public static final Config<Integer> WRITE_QUEUE_BUFFER_MAX_COUNT =
            Config.intConfig("write.queue.buffer.max.count", 1024000);
}
