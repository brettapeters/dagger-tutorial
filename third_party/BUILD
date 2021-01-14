load("@rules_java//java:defs.bzl", "java_library", "java_plugin")

package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "dagger_compiler_plugin",
    generates_api = True,
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    deps = ["//third_party/java/com/google/dagger:dagger_compiler"],
)

java_library(
    name = "dagger_with_compiler",
    exported_plugins = [":dagger_compiler_plugin"],
    exports = ["//third_party/java/com/google/dagger"],
)
