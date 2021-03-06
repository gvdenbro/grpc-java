/*
 * Copyright 2014, gRPC Authors All rights reserved.
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

package io.grpc.protobuf.nano;

import com.google.protobuf.nano.MessageNano;

/**
 * Produce new message instances. Used by a marshaller to deserialize incoming messages.
 *
 * <p>Should be implemented by generated code.
 */
public interface MessageNanoFactory<T extends MessageNano> {
  T newInstance();
}
