//package torch.scalapy
//
//import torch.scalapy.py
//package object pytorch extends torch.scalapy.py.StaticModule("torch") {
//def is_tensor(obj : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("is_tensor")(obj).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
///* MypyFile:1(
//  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_C/__init__.pyi
//  IgnoredLines(284, 287, 289, 336, 344, 348)) */
//def set_default_dtype(d : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("set_default_dtype")(d).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//@py.native trait QInt8Storage extends torch.scalapy.torch._C.QInt8StorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object QInt8Storage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("QInt8Storage")) with py.Object {
//
//}
//@py.native trait QUInt8Storage extends torch.scalapy.torch._C.QUInt8StorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object QUInt8Storage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("QUInt8Storage")) with py.Object {
//
//}
//@py.native trait QInt32Storage extends torch.scalapy.torch._C.QInt32StorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object QInt32Storage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("QInt32Storage")) with py.Object {
//
//}
//def is_storage(obj : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("is_storage")(obj).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//@py.native trait DoubleStorage extends torch.scalapy.torch._C.DoubleStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object DoubleStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("DoubleStorage")) with py.Object {
//
//}
//def name: torch.scalapy.stdlib.str = as[torch.scalapy.py.Dynamic].selectDynamic("name").as[torch.scalapy.stdlib.str]
//def typename(o : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("typename")(o).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//def manager_path(): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("manager_path")().as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//@py.native trait ComplexDoubleStorage extends torch.scalapy.torch._C.ComplexDoubleStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object ComplexDoubleStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("ComplexDoubleStorage")) with py.Object {
//
//}
//def old_flags: torch.scalapy.stdlib.int = as[torch.scalapy.py.Dynamic].selectDynamic("old_flags").as[torch.scalapy.stdlib.int]
//def _storage_classes: torch.scalapy.stdlib.set[torch.scalapy.py.Any] = as[torch.scalapy.py.Dynamic].selectDynamic("_storage_classes").as[torch.scalapy.stdlib.set[torch.scalapy.py.Any]]
//@py.native trait BoolStorage extends torch.scalapy.torch._C.BoolStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object BoolStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("BoolStorage")) with py.Object {
//
//}
//@py.native trait ShortStorage extends torch.scalapy.torch._C.ShortStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object ShortStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("ShortStorage")) with py.Object {
//
//}
///* MypyFile:1(
//  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_torch_docs.py) */
//@py.native trait ByteStorage extends torch.scalapy.torch._C.ByteStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object ByteStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("ByteStorage")) with py.Object {
//
//}
//@py.native trait LongStorage extends torch.scalapy.torch._C.LongStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object LongStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("LongStorage")) with py.Object {
//
//}
//@py.native trait CharStorage extends torch.scalapy.torch._C.CharStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object CharStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("CharStorage")) with py.Object {
//
//}
//def `__all__`: torch.scalapy.stdlib.list[torch.scalapy.stdlib.str] = as[torch.scalapy.py.Dynamic].selectDynamic("__all__").as[torch.scalapy.stdlib.list[torch.scalapy.stdlib.str]]
//@py.native trait BFloat16Storage extends torch.scalapy.torch._C.BFloat16StorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object BFloat16Storage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("BFloat16Storage")) with py.Object {
//
//}
//def compiled_with_cxx11_abi(): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("compiled_with_cxx11_abi")().as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//def _tensor_classes: torch.scalapy.stdlib.set[/* Type[Any] */ torch.scalapy.py.Any] = as[torch.scalapy.py.Dynamic].selectDynamic("_tensor_classes").as[torch.scalapy.stdlib.set[/* Type[Any] */ torch.scalapy.py.Any]]
//def quantized_gru: torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].selectDynamic("quantized_gru").as[torch.scalapy.py.Any]
//def `__package__`: torch.scalapy.stdlib.str = as[torch.scalapy.py.Dynamic].selectDynamic("__package__").as[torch.scalapy.stdlib.str]
//def `__name__`: torch.scalapy.stdlib.str = as[torch.scalapy.py.Dynamic].selectDynamic("__name__").as[torch.scalapy.stdlib.str]
//@py.native trait FloatStorage extends torch.scalapy.torch._C.FloatStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object FloatStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("FloatStorage")) with py.Object {
//
//}
//def _is_deterministic(): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("_is_deterministic")().as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//def set_default_tensor_type(t : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("set_default_tensor_type")(t).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//def _load_global_deps(): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("_load_global_deps")().as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//@py.native trait HalfStorage extends torch.scalapy.torch._C.HalfStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object HalfStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("HalfStorage")) with py.Object {
//
//}
//def `__doc__`: torch.scalapy.stdlib.str = as[torch.scalapy.py.Dynamic].selectDynamic("__doc__").as[torch.scalapy.stdlib.str]
//def _set_deterministic(d : /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any): /* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].applyDynamic("_set_deterministic")(d).as[/* <class 'mypy.types.AnyType'> */ torch.scalapy.py.Any]
//def `__file__`: torch.scalapy.stdlib.str = as[torch.scalapy.py.Dynamic].selectDynamic("__file__").as[torch.scalapy.stdlib.str]
///* MypyFile:1(
//  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_storage_docs.py) */
//def legacy_contiguous_format: torch.scalapy.torch._C.memory_format = as[torch.scalapy.py.Dynamic].selectDynamic("legacy_contiguous_format").as[torch.scalapy.torch._C.memory_format]
//@py.native trait IntStorage extends torch.scalapy.torch._C.IntStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object IntStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("IntStorage")) with py.Object {
//
//}
//@py.native trait ComplexFloatStorage extends torch.scalapy.torch._C.ComplexFloatStorageBase with torch.scalapy.torch.storage._StorageBase {
//
//}
//
//object ComplexFloatStorage extends torch.scalapy.py.StaticValue(as[torch.scalapy.py.Dynamic].selectDynamic("ComplexFloatStorage")) with py.Object {
//
//}
//def quantized_lstm: torch.scalapy.py.Any = as[torch.scalapy.py.Dynamic].selectDynamic("quantized_lstm").as[torch.scalapy.py.Any]
///* MypyFile:1(
//  /nix/store/cl0ngvh4xsdl25i66cji74qa5xf8k2lc-python3.8-pytorch-1.6.0/lib/python3.8/site-packages/torch/_tensor_docs.py) */
//}
