package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int56;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class IUniswapV3PoolDerivedState extends Contract {
    public static final String BINARY = "";

    public static final String FUNC_OBSERVE = "observe";

    public static final String FUNC_SNAPSHOTCUMULATIVESINSIDE = "snapshotCumulativesInside";

    @Deprecated
    protected IUniswapV3PoolDerivedState(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolDerivedState(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IUniswapV3PoolDerivedState(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolDerivedState(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple2<List<BigInteger>, List<BigInteger>>> observe(List<BigInteger> secondsAgos) {
        final Function function = new Function(FUNC_OBSERVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint32>(
                        org.web3j.abi.datatypes.generated.Uint32.class,
                        org.web3j.abi.Utils.typeMap(secondsAgos, org.web3j.abi.datatypes.generated.Uint32.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Int56>>() {}, new TypeReference<DynamicArray<Uint160>>() {}));
        return new RemoteFunctionCall<Tuple2<List<BigInteger>, List<BigInteger>>>(function,
                new Callable<Tuple2<List<BigInteger>, List<BigInteger>>>() {
                    @Override
                    public Tuple2<List<BigInteger>, List<BigInteger>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<List<BigInteger>, List<BigInteger>>(
                                convertToNative((List<Int56>) results.get(0).getValue()), 
                                convertToNative((List<Uint160>) results.get(1).getValue()));
                    }
                });
    }

    public RemoteFunctionCall<Tuple3<BigInteger, BigInteger, BigInteger>> snapshotCumulativesInside(BigInteger tickLower, BigInteger tickUpper) {
        final Function function = new Function(FUNC_SNAPSHOTCUMULATIVESINSIDE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tickLower), 
                new org.web3j.abi.datatypes.generated.Int24(tickUpper)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int56>() {}, new TypeReference<Uint160>() {}, new TypeReference<Uint32>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple3<BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    @Deprecated
    public static IUniswapV3PoolDerivedState load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolDerivedState(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IUniswapV3PoolDerivedState load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolDerivedState(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IUniswapV3PoolDerivedState load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolDerivedState(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IUniswapV3PoolDerivedState load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolDerivedState(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IUniswapV3PoolDerivedState> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolDerivedState.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolDerivedState> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolDerivedState.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IUniswapV3PoolDerivedState> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolDerivedState.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolDerivedState> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolDerivedState.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
